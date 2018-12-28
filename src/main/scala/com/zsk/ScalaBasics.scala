package com.zsk

import java.io.File

//2.scala函数定义、流程控制、异常处理入门
object ScalaBasics {
  def main(args: Array[String]): Unit = {
    //doWhile()
    //doWhile
    //println(lopper(100, 298))

    //流程控制
    var file ="C://a.txt"
    file = if(!args.isEmpty) args(0) else "C://a.txt"
    println(file)

    for(i<- 1 to 10 ){
      println("Number is : "+i)
    }

    var files = new File(".").listFiles()
    for(i<-files){
      println(i)
    }

    //异常处理入门
    val n = 99
    try{
      val half = if(n%2==0) n/2 else throw new RuntimeException("N must be even")
    }catch {
      case e:Exception=>println(e.getMessage)
    }finally{

    }
  }
  //函数定义
  def doWhile(): Unit ={
    var line="";
    do{
      line = readLine()
      println("Read:"+line)
    }while(line!="")
  }
  def lopper(x:Long,y:Long):Long={
    var a = x
    var b = y
    while(a!=0){
      val tmp = a
      a=b%a
      b=tmp
    }
    b
  }

}
