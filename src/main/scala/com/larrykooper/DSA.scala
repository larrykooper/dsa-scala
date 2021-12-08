package com.larrykooper

object DSA {
  def main(args: Array[String]) {
    val list = LinkedList.emptyList
    println(s"size is now: ${list.size}")
    val list2 = list.insertAtBeginning(2)
    list2.print
    println(s"size is now: ${list2.size}")
    val list3 = list2.insertAtBeginning(1)
    list3.print
    println(s"size is now: ${list3.size}")
    val list4 = list3.insertAtBeginning(3)
    list4.print
    println(s"size is now: ${list4.size}")
  }
}