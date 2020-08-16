import java.util.*

import com.github.mm.coloredconsole.*

data class Node<T>(val value: T,
                   var leftNode: Node<T>?,
                   var rightNode: Node<T>?,
                   var depth: Int = 0) {
    fun link(left: Node<T>?, right: Node<T>?) = this.apply {
        linkLeft(left).linkRight(right)
    }

    fun linkLeft(left: Node<T>?) = this.apply { leftNode = left }

    fun linkRight(right: Node<T>?) = this.apply { rightNode = right }

    fun depth(value: Int) = this.apply { depth = value }

    override fun toString(): String {
        return StringBuilder().apply {
            append("{${value.toString()}")
            if (leftNode != null)
                append(", ${leftNode.toString()}")
            if (rightNode != null)
                append(", ${rightNode.toString()}}")
        }.toString()
    }
}

fun buildCharTree(): Node<Char> {
    val a = Node('a', null, null)
    val b = Node('b', null, null)
    val c = Node('c', null, null)
    val d = Node('d', null, null)
    val e = Node('e', null, null)
    val f = Node('f', null, null)
    val g = Node('g', null, null)
    val h = Node('h', null, null)
    val i = Node('i', null, null)

    a.link(b, c)
    b.link(d, e)
    c.link(f, g)
    g.link(h, i)

    return a
}

fun buildIntTree(): Node<Int> {
    val a = Node(3, null, null)
    val b = Node(9, null, null)
    val d = Node(20, null, null)
    val e = Node(15, null, null)
    val f = Node(7, null, null)

    a.link(b, d)
    d.link(e, f)

    return a
}

fun <T> traversalPreOrder(node: Node<T>?, list: MutableList<T>) {
    if (node != null) {
        list.add(node.value)
        traversalPreOrder(node.leftNode, list)
        traversalPreOrder(node.rightNode, list)
    }
}

fun <T> traversalInOrder(node: Node<T>?, list: MutableList<T>) {
    if (node != null) {
        traversalInOrder(node.leftNode, list)
        list.add(node.value)
        traversalInOrder(node.rightNode, list)
    }
}

fun <T> traversalPostOrder(node: Node<T>?, list: MutableList<T>) {
    if (node != null) {
        traversalPostOrder(node.leftNode, list)
        traversalPostOrder(node.rightNode, list)
        list.add(node.value)
    }
}

fun <T> breadthFirstTraversal(root: Node<T>): MutableList<Node<T>> {
    val queue = LinkedList<Node<T>>()
    val traversalList = mutableListOf<Node<T>>()

    // Add first node.
    queue.add(root)

    // Use queue to create breadth first traversal.
    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()
        val depth = currentNode.depth

        // Add left node first.
        if (currentNode.leftNode != null)
            queue.add(currentNode.leftNode!!.depth(depth + 1))

        // Add right node next.
        if (currentNode.rightNode != null)
            queue.add(currentNode.rightNode!!.depth(depth + 1))

        // Add the node to the traversal list.
        traversalList.add(currentNode)
    }

    return traversalList
}

fun <T> printBFSTraversal(root: Node<T>): String {

    val queue = LinkedList<Node<T>>()
    // Add first node.
    queue.add(root)

    val mapVisitedDepth = mutableMapOf<Int, MutableList<T>>()
    // Use queue to create breadth first traversal.
    while (queue.isNotEmpty()) {
        val currentNode = queue.poll()
        val depth = currentNode.depth

        // Add left node first.
        if (currentNode.leftNode != null)
            queue.add(currentNode.leftNode!!.depth(depth + 1))

        // Add right node next.
        if (currentNode.rightNode != null)
            queue.add(currentNode.rightNode!!.depth(depth + 1))

        // Decide whether to print crlf or not.
        mapVisitedDepth.computeIfAbsent(depth){ mutableListOf()}
            .add(currentNode.value)
    }

    val outputString = StringBuilder()

    for (entry in mapVisitedDepth) {
        outputString.append(entry.value.joinToString(", ", postfix = "\n"))
    }

    return outputString.toString()
}

fun <T> depthFirstTraversal(root: Node<T>): MutableList<Node<T>> {
    val stack = LinkedList<Node<T>>()
    val traversalList = mutableListOf<Node<T>>()

    // Add first node.
    stack.push(root)

    // Use stack to create breadth first traversal.
    while (stack.isNotEmpty()) {
        val currentNode = stack.pop()
        val depth = currentNode.depth

        // Push right child to stack FIRST (so this will be processed LAST).
        if (currentNode.rightNode != null)
            stack.push(currentNode.rightNode!!.depth(depth + 1))

        // Push left child to stack LAST (so this will be processed FIRST).
        if (currentNode.leftNode != null)
            stack.push(currentNode.leftNode!!.depth(depth + 1))

        // Add to traversal list.
        traversalList.add(currentNode)
    }

    return traversalList
}

val t = buildIntTree()
t
var l = mutableListOf<Int>()
traversalInOrder(t,l)
l
l = mutableListOf()
traversalPostOrder(t,l)
l
l = mutableListOf()
traversalPreOrder(t,l)
l
l = mutableListOf()
breadthFirstTraversal(t)
depthFirstTraversal(t)
printBFSTraversal(t)
