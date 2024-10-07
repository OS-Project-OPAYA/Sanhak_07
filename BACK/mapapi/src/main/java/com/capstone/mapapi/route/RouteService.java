// package com.capstone.mapapi.route;

// import okhttp3.*;
// import org.springframework.stereotype.Service;
// import java.io.IOException;

// @Service
// public class RouteService {
//     private static final String TMAP_API_URL = "https://apis.openapi.sk.com/tmap/routes/pedestrian?version=1&callback=function";
//     private static final String API_KEY = "EHDhTt6iqk7HwqS2AirSY71g65xVG8Rp3LtZaIIx";

//     public String getRoute(double startX, double startY, double endX, double endY) throws IOException {
//         OkHttpClient client = new OkHttpClient();

//         // Request Body 설정
//         String jsonBody = String.format("{\"startX\":%f,\"startY\":%f,\"endX\":%f,\"endY\":%f,\"reqCoordType\":\"WGS84GEO\",\"resCoordType\":\"WGS84GEO\"}",
//                                          startX, startY, endX, endY);
//         @SuppressWarnings("deprecation")
//         RequestBody body = RequestBody.create(MediaType.parse("application/json"), jsonBody);

//         // Request 설정
//         Request request = new Request.Builder()
//                 .url(TMAP_API_URL)
//                 .post(body)
//                 .addHeader("accept", "application/json")
//                 .addHeader("content-type", "application/json")
//                 .addHeader("appKey", API_KEY)
//                 .build();

//         // 응답 받기
//         Response response = client.newCall(request).execute();
//         return response.body().string();
//     }
// }
