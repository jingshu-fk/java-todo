package com.xintest;

import java.util.Arrays;
import java.util.List;

/**
 * @author SHUJINGPING
 */
public class Test005 {
    public static void main(String[] args) {
        Integer i1 = 6;
        int i2 = 129;

        int[][] a = new int[5][3];
        System.out.println(a[0].length);

        String token = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6InJWblZTVUhkcF9ySnJaejdSMEJ5T3ZvQ25vNjhSanNFT19oaEhjNmZMbjAifQ.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJhY3Mtc3lzdGVtIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZWNyZXQubmFtZSI6ImFlY3AtaW5zdGFsbGVyLW9wZXJhdG9yLXRva2VuLTk0Z3ZoIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQubmFtZSI6ImFlY3AtaW5zdGFsbGVyLW9wZXJhdG9yIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQudWlkIjoiMDNjMGJjYjUtNjc3ZC00OGNkLThiNzYtODMwNjdjYzU2NzZhIiwic3ViIjoic3lzdGVtOnNlcnZpY2VhY2NvdW50OmFjcy1zeXN0ZW06YWVjcC1pbnN0YWxsZXItb3BlcmF0b3IifQ.bsFkKSt75QAkwkY3ECgU9zi7Zc3bDrIYeJA3TDhoXzbAxHXTU2c09YXhVfeLTpeJ4Ncb7MARQQlf_p7dWgaTC5756F5XmVJvKMz19O8GPeSRF4yYpLCs5m-87Y0BtoJEYxK2Qsd7JiU6GjzlfU7qpPkUHhY72YdjAM-VnkwkCEYZVEP9sLIEQX2Db9K2WKuc3oCcT6YtuhqGp9dhqIm9kmsMYVz5bjAHsFJ3rnhUQCa6M8B8YHkowx1gZ2SXp--sbHNAqSQ6nsLSSz_DYyn2RORT7a9qzR4I8RUVP217JnE4WxgvAiRzoAOyz1TUJcvhC_F9EwEEwg1OplABXPDptQ";
        String authToken = token.substring("Bearer".length());
        System.out.println(authToken);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Object[] array = list.toArray();
        System.out.println("array className ：" + array.getClass().getSimpleName());
        array[0] = new Object();
    }
}
