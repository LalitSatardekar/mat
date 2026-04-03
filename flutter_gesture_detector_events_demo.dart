import 'package:flutter/material.dart';

void main() => runApp(GestureDemo());

class GestureDemo extends StatefulWidget {
  @override
  _GestureDemoState createState() => _GestureDemoState();
}

class _GestureDemoState extends State<GestureDemo> {
  String _gestureStatus = '';

  void _onTap() {
    setState(() {
      _gestureStatus = 'Tapped!';
    });
  }

  void _onDoubleTap() {
    setState(() {
      _gestureStatus = 'Double Tapped!';
    });
  }

  void _onLongPress() {
    setState(() {
      _gestureStatus = 'Long Pressed!';
    });
  }

  void _onVerticalDragStart(DragStartDetails details) {
    setState(() {
      _gestureStatus = 'Drag started vertically!';
    });
  }

  void _onVerticalDragUpdate(DragUpdateDetails details) {
    setState(() {
      _gestureStatus = 'Dragging vertically!';
    });
  }

  void _onVerticalDragEnd(DragEndDetails details) {
    setState(() {
      _gestureStatus = 'Drag ended vertically!';
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Gesture Demo'),
        ),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            GestureDetector(
              onTap: _onTap,
              onDoubleTap: _onDoubleTap,
              onLongPress: _onLongPress,
              onVerticalDragStart: _onVerticalDragStart,
              onVerticalDragUpdate: _onVerticalDragUpdate,
              onVerticalDragEnd: _onVerticalDragEnd,
              child: Container(
                height: 200,
                color: Colors.blueGrey,
                child: Center(
                  child: Text(
                    _gestureStatus,
                    style: TextStyle(fontSize: 24),
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}