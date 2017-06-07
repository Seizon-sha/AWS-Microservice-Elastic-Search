# // Main Lambda Handler code that calls all the functions when it is triggered

def lambda_handler(event, context):
   esClient = connectES("search-demo-ujm7kbiyrju7lvjhds4ns7okje.us-east-1.es.amazonaws.com")
   createIndex(esClient)

   # Get the object from the event and show its content type
   bucket = event['Records'][0]['s3']['bucket']['name']
   key = urllib.unquote_plus(event['Records'][0]['s3']['object']['key'].encode('utf8'))
   try:
     response = s3.get_object(Bucket=bucket, Key=key)
     print(response)
     print("KEY: " + key)
     print("CONTENT TYPE: " + response['ContentType'])
     print("Metadata : " + json.dumps(response['Metadata']))
     print("Custom 1: " + response['ResponseMetadata']['HTTPHeaders']['x-amz-meta-custom1'])
     print("Custom 2: " + response['ResponseMetadata']['HTTPHeaders']['x-amz-meta-custom2'])
     print("Custom 3: " + response['ResponseMetadata']['HTTPHeaders']['x-amz-meta-custom3'])
     indexDocElement(esClient,key,response)
     return response['ContentType']
   except Exception as e:
     print(e)
     print('Error getting object {} from bucket {}.format(key, bucket)')
     raise e