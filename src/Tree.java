import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Tree<T> implements Iterable<Tree<T>> {

    T data;
    Tree<T> parent;
    List<Tree<T>> children;

    public Tree(T data) {
        this.data = data;
        this.children = new ArrayList<Tree<T>>();
    }

    public Tree<T> addChild(T child) {
        Tree<T> childNode = new Tree<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }

	@Override
	public Iterator<Tree<T>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}