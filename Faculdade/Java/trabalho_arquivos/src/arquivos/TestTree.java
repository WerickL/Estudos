package arquivos;

import java.util.List;
public class TestTree {
	public static void main(String[] args) {
		Tree tree=new Tree("Mundo");
		Node root = tree.getRoot();
		Node brasil = new Node("Brasil");
		Node america = new Node("America");
		root.add(brasil);
		root.add(america); 
		Node sanfancisco = new Node("San Fancisco");
		Node newyork = new Node("New York");
		america.add(sanfancisco);
		america.add(newyork);
		System.out.println(root.getName());
		List<Node> childeNodes = root.getChildNodes();
		for (Node node : childeNodes) {
			System.out.println("----" + node.getName());
			List<Node> childNodes2 = node.getChildNodes();
			for (Node node2 : childNodes2) {
				System.out.println("--------" + node2.getName());
			}
		}
	}
} 
