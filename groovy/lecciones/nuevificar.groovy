@Newify rubyLikeNew() {
    assert Integer.new(42) == 42
}


rubyLikeNew()

class Tree {
    def elements
    Tree(Object... elements) { this.elements = elements as List }
}


class Leaf {
    def value
    Leaf(value) { this.value = value }
}


def buildTree() {
    new Tree(new Tree(new Leaf(1), new Leaf(2)), new Leaf(3))
}

@Newify([Tree, Leaf]) crearArbol() {
    Tree(Tree(Leaf(1), Leaf(2)), Leaf(3))
}


buildTree()
crearArbol()