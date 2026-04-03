import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  bool dark = false;

  @override
  Widget build(BuildContext c) => MaterialApp(
        debugShowCheckedModeBanner: false,
        theme: ThemeData(
          brightness: dark ? Brightness.dark : Brightness.light,
          textTheme: TextTheme(
            bodyLarge: TextStyle(fontFamily: 'Poppins'),
          ),
        ),
        home: Scaffold(
          appBar: AppBar(title: Text("Theme")),
          body: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Image.asset('assets/images/flutter_logo.png', width: 120),
                Text("Customize!", style: Theme.of(c).textTheme.bodyLarge),
                ElevatedButton(
                  onPressed: () => setState(() => dark = !dark),
                  child: Text("Toggle"),
                ),
              ],
            ),
          ),
        ),
      );
}
