class TN(var v: Int) {
    var l: TN? = null
    var r: TN? = null
}

fun makeNode(v: Int?): TN? =
    if (v == null) null
    else TN(v)

fun treeToList(root: TN?): List<Any?>? =
    if (root == null) null
    else listOf(root.v) + treeToList(root.l) + treeToList(root.r)

var ia = arrayListOf(3,9,20,null,null,15,7)
var i = 0

val res = makeNode(ia[i++])

res?.l = makeNode(ia[i++])
res?.r = makeNode(ia[i++])

treeToList(res)

res?.l?.l = makeNode(ia[i++])
res?.l?.r = makeNode(ia[i++])

res?.r?.l = makeNode(ia[i++])
res?.r?.r = makeNode(ia[i++])

treeToList(res)