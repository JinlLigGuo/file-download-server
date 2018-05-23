package com.springboot.running.utils.core;

import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;

/**
 * https忽略验证
 * @author liguang.jin
 *
 */
public class SSLClient extends DefaultHttpClient{
	 public SSLClient() throws Exception{  
	        super();  
	        SSLContext ctx = SSLContext.getInstance("TLS");  
	        X509TrustManager tm = new X509TrustManager() {  
	                @Override  
	                public void checkClientTrusted(X509Certificate[] chain,  
	                        String authType) throws CertificateException {  
	                }  
	                @Override  
	                public void checkServerTrusted(X509Certificate[] chain,  
	                        String authType) throws CertificateException {  
	                }  
	                @Override  
	                public X509Certificate[] getAcceptedIssuers() {  
	                    return null;  
	                }  
	        };  
	        ctx.init(null, new TrustManager[]{tm}, null);  
	        SSLSocketFactory ssf = new SSLSocketFactory(ctx,SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  
	        ClientConnectionManager ccm = this.getConnectionManager();  
	        SchemeRegistry sr = ccm.getSchemeRegistry();  
	        sr.register(new Scheme("https", 443, ssf));  
	 }
	
}
