package P3

interface MindObject {
    fun showContent(level : Int)
    fun addChild(obj : MindObject)
    fun removeChild(obj : MindObject)
}