// package com.capstone.mapapi.route;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.io.IOException;

// @RestController
// @RequestMapping("/api/route")
// public class RouteController {

//     @Autowired
//     private RouteService routeService;

//     @PostMapping
//     public String getRoute(@RequestBody Route route) {
//         try {
//             return routeService.getRoute(route.getStartX(), route.getStartY(), route.getEndX(), route.getEndY());
//         } catch (IOException e) {
//             e.printStackTrace();
//             return "{\"error\": \"경로를 찾을 수 없습니다.\"}";
//         }
//     }
// }
