
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
          appBar: AppBar(
            title: const Text("Login"),
          ),
          body: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
            const Text(
            'Flutter Practical',
            style: TextStyle(fontWeight: FontWeight.bold, fontSize: 30),
          ),
          const SizedBox(
            height: 30,
          ),
          const TextField(
            decoration: InputDecoration(hintText: 'Enter Your Name'),
          ),
          const SizedBox(
            height: 30,
          ),
          ElevatedButton(
            onPressed: () {
            },
            child: const Text('Login',style: TextStyle(fontSize: 30),),
          ),
          const SizedBox(
            height: 30,
          ),
          const Image(
          image:
          NetworkImage('https://media.formula1.com/image/upload/t_16by9Centre/c_lfill,w_3392/q_auto/v1740000001/fom-website/2025/Ferrari/Ferrari%20SF-25%20launch%20renders/F677_still_02_v11_169.webp')
      ),
      ],
    ),
    ),
    );
  }
} 