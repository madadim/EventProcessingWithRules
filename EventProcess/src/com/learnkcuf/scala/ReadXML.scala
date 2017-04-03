package com.learnkcuf.scala

/**
  * Created by A072837 on 4/1/17.
  */
object ReadXML {

  val dbconnection =
    <rss>
      <databaseconnection>
        <description>Database connection details</description>
        <item1>
          <title>Hive connection details</title>
          <DB1 connectionstring="1"
                driver=""
                username=""
                password=""/>
        </item1>
        <item2>
          <title>Mysql connection details</title>
          <DB2 connectionstring="2"
                driver=""
                username=""
                password=""/>
        </item2>
      </databaseconnection>
    </rss>

  val DB1 = dbconnection \ "databaseconnection" \ "item1" \ "DB1"
  val DB2 = dbconnection \ "databaseconnection" \ "item2" \ "DB2"

  val connstring = DB1 \ "@connectionstring"
  val

  print(connstring)

}
