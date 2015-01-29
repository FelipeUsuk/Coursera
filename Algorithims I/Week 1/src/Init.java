
public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     QuickUnionUF qu = new QuickUnionUF(10);
    QuickFindUF qf = new QuickFindUF(10);
    
    qf.union(6,0);
    qf.union(7,6);
    qf.union(9,3);
    qf.union(3,0);
    qf.union(1,8);
    qf.union(7,4);
    
    qu.union(3,6);
    qu.union(7,0);
    qu.union(8,9);
    qu.union(6,4);
    qu.union(9,0);
    qu.union(2,5);
    qu.union(2,6);
    qu.union(0,3);
    qu.union(7,1);
     
    qu.printArray();
    qf.printArray();
    
	}

}
