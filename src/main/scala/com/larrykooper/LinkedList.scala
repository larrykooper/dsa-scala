package com.larrykooper

class LinkedList(var head: Option[Node]) {

  def insertAtBeginning(item: Int): LinkedList = {
    println(s"insertAtBeginning was called with: $item")
    val n = new Node(item, None)
    n.next = if (this.isEmpty) None else head
    head = Some(n)
    this
  }

  def print: LinkedList = {
    val h = head.get
    h.print
    h.next match {
      case Some(next) => {
        val list = new LinkedList(Some(next))
        list.print
      }
      case None => LinkedList.emptyList
    }
  }

  def isEmpty: Boolean = {
    head match {
      case Some(node) => false
      case None => true
    }
  }

  def size: Int = {
    this.head match {
      case Some(n) =>
        val list = new LinkedList(n.next)
        list.size + 1
      case None => 0
    }
  }
}
 object LinkedList {

   def emptyList: LinkedList = {
     new LinkedList(None)
   }

}