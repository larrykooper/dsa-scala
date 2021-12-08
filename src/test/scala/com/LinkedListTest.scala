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
  }
}