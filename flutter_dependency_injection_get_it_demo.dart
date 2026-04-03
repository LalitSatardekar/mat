import 'package:flutter/material.dart';
import 'package:get_it/get_it.dart';

final getIt = GetIt.instance;

class ApiService {
  String fetchData() {
    return "Data fetched from ApiService!";
  }
}

void setup() {
  getIt.registerSingleton<ApiService>(ApiService());
}

void main() {
  setup();
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomeScreen(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final api = getIt<ApiService>();

    return Scaffold(
      appBar: AppBar(title: Text("Dependency Injection")),
      body: Center(
        child: Text(api.fetchData()),
      ),
    );
  }
}