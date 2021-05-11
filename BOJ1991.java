package 백준공부;

import java.util.Scanner;

class Node{
	char Data;
	Node Left, Right;
	public Node(char Data) {
		this.Data = Data;
	}
}

class Tree {
	Node Root;
	public void Add(char Data, char Left_Data, char Right_Data) {
		if (Root==null) {
			if (Data!= '.') Root = new Node(Data);
			if (Left_Data!= '.') Root.Left = new Node(Left_Data);
			if (Right_Data!= '.') Root.Right = new Node(Right_Data);
		}
		else Search(Root,Data,Left_Data,Right_Data);
	}
	public void Search(Node Root, char Data, char Left_Data, char Right_Data) {
		if(Root==null) return;
		else if (Root.Data==Data) {
			if (Left_Data!='.') Root.Left = new Node(Left_Data);
			if (Right_Data!='.') Root.Right = new Node(Right_Data);
		}
		else {
			Search(Root.Left,Data,Left_Data,Right_Data);
			Search(Root.Right,Data,Left_Data,Right_Data);
		}
	}
	public void PreOrder(Node Root) {
		System.out.print(Root.Data);
		if(Root.Left!=null) PreOrder(Root.Left);
		if(Root.Right!=null) PreOrder(Root.Right);
	}
	public void InOrder(Node Root) {
		if(Root.Left!=null) InOrder(Root.Left);
		System.out.print(Root.Data);
		if(Root.Right!=null) InOrder(Root.Right);
	}
	public void PostOrder(Node Root) {
		if(Root.Left!=null) PostOrder(Root.Left);
		if(Root.Right!=null) PostOrder(Root.Right);
		System.out.print(Root.Data);
	}
	}
public class BOJ1991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Tree tree = new Tree();
		for (int i=0;i<N;i++) {
			tree.Add(scan.next().charAt(0), scan.next().charAt(0),scan.next().charAt(0));
		}
		tree.PreOrder(tree.Root);
		System.out.println();
		tree.InOrder(tree.Root);
		System.out.println();
		tree.PostOrder(tree.Root);
	}
	

}
//어차피 남 코드 참고해서 배우는 게 나을 거 같애서 그냥
//https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-1991%EB%B2%88-%ED%8A%B8%EB%A6%AC%EC%88%9C%ED%9A%8C-%EC%9E%90%EB%B0%94Java 
//여기 코드 완전 참고