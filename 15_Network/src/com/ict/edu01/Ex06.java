package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//파싱 : 파싱은 어떤 페이지(문서, html 등)에서 
//내가 원하는 데이터를 특정 패턴이나 순서로 추출해 가공하는 것을 말한다.

//JSON : JSON(제이슨)은 속성-값 쌍 또는 "키-값 쌍"으로 이루어진 
//데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는 
//텍스트를 사용하는 개방형 표준 포맷이다. 
//비동기 브라우저/서버 통신(AJAX)을 위해, 넓게는 XML을 대체하는 주요 데이터 포맷이다
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		// 파일로 저장
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "도서관.txt";
		File file = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = 
				new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
				sb.append(msg+"\n");
			}
			
			// json 파일 읽기 : json을 읽는 외부라이브러리 연결하기 
			// 해당프로젝트에서 마우스 오른쪽 - Build path - 
			JSONParser parser = new JSONParser();
			JSONObject obj1 = (JSONObject) parser.parse(sb.toString());
			JSONObject obj2 = (JSONObject) obj1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) obj2.get("row");
			
			StringBuffer sb2 = new StringBuffer();
			
			/*
			for (Object k : j_arr) {
				// System.out.println(k);
				sb2.append(k+"\n");
			}
			*/
			for (Object k : j_arr) {
				JSONObject jobj = (JSONObject) k;
				String name = (String) jobj.get("LBRRY_NAME"); // key값을 넣으면 Value값이 나온다
				String phone = (String) jobj.get("TEL_NO"); // key값을 넣으면 Value값이 나온다
				String addr = (String) jobj.get("ADRES"); // key값을 넣으면 Value값이 나온다
				System.out.println(name+"\t"+phone+"\t"+addr);
			}
			System.out.println("============================================");
			
			for (int i = 0; i < j_arr.size(); i++) {
				JSONObject obj3 = (JSONObject)(j_arr.get(i));
				String name = (String) obj3.get("LBRRY_NAME"); // key값을 넣으면 Value값이 나온다
				String phone = (String) obj3.get("TEL_NO"); // key값을 넣으면 Value값이 나온다
				String addr = (String) obj3.get("ADRES"); // key값을 넣으면 Value값이 나온다

				sb2.append(name+"\t"+phone+"\t"+addr+"\n");
				System.out.println(name+"\t"+phone+"\t"+addr);
			}
			
			// 파일로 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb2.toString());
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
