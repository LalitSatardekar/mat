import 'package:flutter/material.dart'; 
 
void main() { 
  runApp(MyApp()); 
} 
 
class MyApp extends StatelessWidget { 
  @override 
  Widget build(BuildContext context) { 
    return MaterialApp( 
      title: 'Layout Demo', 
      home: Scaffold( 
        appBar: AppBar( 
          title: Text('Layout Demo'), 
        ), 
        body: Center( 
          child: Column( 
            mainAxisAlignment: MainAxisAlignment.center, 
            children: [ 
              Text('This is a column'), 
              SizedBox(height: 20), 
              Row( 
                mainAxisAlignment: MainAxisAlignment.spaceAround, 
                children: [ 
                  Container( 
                    height: 50, 
                    width: 50, 
                    color: Colors.blue, 
                  ), 
                  Container( 
                    height: 50, 
                    width: 50, 
                    color: Colors.red, 
                  ), 
                  Container( 
                    height: 50, 
                    width: 50, 
                    color: Colors.green, 
                  ), 
                ], 
              ), 
8A
Aim: Design the app layout effectively using Row, Column, and Stack Widgets for a
         visually appealing UI.
              SizedBox(height: 20), 
              Expanded( 
                child: Container( 
                  color: Colors.yellow, 
                  child: Center( 
                    child: Text('This is an expanded container'), 
                  ), 
                ), 
              ), 
            ], 
          ), 
        ), 
      ), 
    ); 
  } 
} 
 
 