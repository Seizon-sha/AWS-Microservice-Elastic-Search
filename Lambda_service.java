package org.sonatype.mavenbook.search;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.object;
import java.util.logging.Handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.event.S3EventNotification.S3EventNotificationRecord;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;

public class Lambda_Handler{
		public static void main(String[] args) {

			BufferedReader br = null;
			String line = "";
			String cvsSplitBy = ",";
	try{
	String srcBucket = record.getS3().getBucket().getName();
	String srcKey = record.getS3().getObject().getKey()
                    .replace('+', ' ');
            
	
	 if (srcBucket.equals(dstBucket)) {
                System.out
                        .println("Destination bucket must not match source bucket.");
                return "";
            }
            while ((line = br.readLine()) != null)

             AmazonS3 s3Client = new AmazonS3Client();
            S3Object s3Object = s3Client.getObject(new GetObjectRequest(
                    srcBucket, srcKey));
            
            String[] s3Object.value = line.split(cvsSplitBy);
	                System.out.print("value1: "+ s3Object.value[0]);
	                System.out.print(" value2: "+ s3Object.value[1]);
	                System.out.print(" value3: "+ s3Object.value[2]);
	                 
	                System.out.println("");
	                }
            catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	    }
