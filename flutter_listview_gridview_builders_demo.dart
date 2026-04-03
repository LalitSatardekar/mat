import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Home(),
  ));
}

class Home extends StatelessWidget {
  final items = List.generate(10, (i) => "Item ${i + 1}");

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("List & Grid")),
      body: Column(
        children: [
          // ListView
          Expanded(
            child: ListView(
              children: items.map((e) => ListTile(title: Text(e))).toList(),
            ),
          ),

          Divider(),

          // ListView.builder
          Expanded(
            child: ListView.builder(
              itemCount: items.length,
              itemBuilder: (_, i) => ListTile(title: Text(items[i])),
            ),
          ),

          Divider(),

          // GridView
          Expanded(
            child: GridView.count(
              crossAxisCount: 2,
              children: List.generate(
                6,
                (i) => box("Box ${i + 1}", Colors.blue),
              ),
            ),
          ),

          Divider(),

          // GridView.builder
          Expanded(
            child: GridView.builder(
              gridDelegate:
                  SliverGridDelegateWithFixedCrossAxisCount(crossAxisCount: 2),
              itemCount: 6,
              itemBuilder: (_, i) =>
                  box("Box ${i + 1}", Colors.green),
            ),
          ),
        ],
      ),
    );
  }

  // Common widget (reduces code)
  Widget box(String text, Color color) {
    return Container(
      margin: EdgeInsets.all(8),
      color: color,
      child: Center(
        child: Text(text, style: TextStyle(color: Colors.white)),
      ),
    );
  }
}
