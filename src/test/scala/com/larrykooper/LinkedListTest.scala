package com.larrykooper

import org.scalatest.funspec.AnyFunSpec

class LinkedListTest extends AnyFunSpec {
  describe("a linked list") {
    describe("when empty") {
      it("should have size 0") {
        assert(LinkedList.emptyList.size == 0)
      }
    }

    describe("adding a node") {
      it("should have size 1") {
        val l = LinkedList.emptyList
        val list2 = l.insertAtBeginning(2)
        assert(list2.size == 1)
      }
    }

    describe("search") {
      it("should find item if present") {
        val l = LinkedList.emptyList
        val list2 = l.insertAtBeginning(2)
        val list3 = list2.insertAtBeginning(7)
        val list4 = list3.insertAtBeginning(8)
        val n = list4.search(7)
        assert(n.get.data == 7)
      }

      it("should return None if not present") {
        val l = LinkedList.emptyList
        val list2 = l.insertAtBeginning(2)
        val list3 = list2.insertAtBeginning(7)
        val list4 = list3.insertAtBeginning(8)
        val n = list4.search(10)
        assert(!n.isDefined)
      }
    }

  }  // describe a linked list
}