package com.learnkcuf.scala

/**
  * Created by A072837 on 4/1/17.
  */

import scala.xml.XML
object ReadXML {

  def main(args: Array[String]): Unit = {

    val xmlcontent = XML.loadFile("/Users/A072837/git/EventProcessingWithRules/EventProcessingWithRules/EventProcess/EventProcess.xml")

    val DB1 = xmlcontent \ "databaseconnection" \ "item1" \ "DB1"
    val DB2 = xmlcontent \ "databaseconnection" \ "item2" \ "DB2"

    val connstring1 = DB1 \ "@connectionstring"
    val connstring2 = DB2 \ "@connectionstring"

    print(connstring1)
    print(connstring2)

  }
}
