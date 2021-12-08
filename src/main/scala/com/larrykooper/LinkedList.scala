package com.larrykooper

class LinkedList(var head: Option[Node]) {

  def insertAtBeginning(item: Int): LinkedList = {
    val n = new Node(item, None)
    n.next = if (this.isEmpty) None else head
    head = Some(n)
    this
  }

  // buggy, blows up if you print an empty list
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

  // find first element with given key
  // returns None if not found
  def search(k: Int): Option[Node] = {
    val h = this.head
    val d = h.filter(_.data == k)
    d match {
      case Some(n) => h
      case None => h match {
        case Some(n) =>
          val list = new LinkedList(n.next)
          list.search(k)
        case None => None
      }
    }

  }

} // end of class

 object LinkedList {

   def emptyList: LinkedList = {
     new LinkedList(None)
   }

}