package list;

public class list1 {

	    public static void main(String[] args) {
	        int x = 1, y = 10, n=30;
	        Node<Integer> head = generateRandomNumbers(x, y, n);
	        System.out.println("Generated List: " + head);

	        int numberToCount = 5;
	        int occurrences = countOccurrences(head, numberToCount);
	        System.out.println("Number " + numberToCount + " appears " + occurrences + " times.");
	    }

	    
	    public static Node<Integer> generateRandomNumbers(int x, int y, int n) {
	       
	        Node<Integer> head = new Node<>((int) (Math.random() * (y - x + 1)) + x);
	        Node<Integer> current = head;

	        for (int i = 1; i < n; i++) {
	            Node<Integer> newNode = new Node<>((int) (Math.random() * (y - x + 1)) + x);
	            current.setNext(newNode);
	            current = newNode;
	        }

	        return head; 
	    }

	    
	    public static int countOccurrences(Node<Integer> head, int target) {
	        int count = 0;
	        Node<Integer> current = head;

	        while (current != null) {
	            if (current.getValue() == target) {
	                count++;
	            }
	            current = current.getNext();
	        }

	        return count;
	    }
public class Main {
	public static Scanner reader = new Scanner(System.in); 
	    public static Node<Integer> f1(int x, int y){
	        Node<Integer> a1 = null;   
	        Node<Integer> a2 = null;

	        for (int i = 0; i < 20; i++) {
	        	int r = (int)((Math.random() * (y-x+1))+x); 
	            Node<Integer> a3 = new Node<>(r);

	            if (a1 == null) {
	                a1 = a3;  
	                a2 = a1;
	            } else {
	                a2.setNext(a3);  
	                a2 = a3;  
	            }
	        }

	        return a1;  
	    }
	
	    
	    
	    public static int f2(Node<Integer> a1, int x) {
	        int count = 0;
	        while (a1 != null) {
	            if (a1.getValue().equals(x)) {
	                count++;
	            }
	            a1 = a1.getNext();  
	        }

	        return count;
	    }
	
	    
	    
	    
	    public static void q2(Node<Integer> a1) {
	        
	        while (a1 != null) {
	        	System.out.println(a1.getValue());
	            a1 = a1.getNext();  
	        }

	    }
	    
	    
        public static String f3(Node<Integer> a1) {
	        
	        if(a1 == null) {
	        	return "";
	        }
	        System.out.println(a1.getValue());
	        a1 = a1.getNext();  
	        return f3(a1);

	    }
        
        public static void f4(Node<Integer> a1) {
	        
	        if(a1 != null) {
	        	f4(a1.getNext());
	        	System.out.println(a1.getValue());
	        }

	    }
        
        
        
        public static Node<Integer> q3() {
        	 System.out.println("Please enter a number: ");  
			 int a= reader.nextInt();
			 Node<Integer> a1 = new Node<Integer>(a);
        	 if(a1.getValue() ==-1) {
        		 return null;
        	 }
        	 
        	 System.out.println("Please enter a number: ");  
        	 int b = reader.nextInt(); 
        	 Node<Integer> a2 = new Node<Integer>(b);
             Node<Integer> a3=a2;
             a2=a1;
            		 
	         while(a3.getValue() != -1) {
	             a2.setNext(a3); 
	             a2=a3;
	             System.out.println("Please enter a number: ");  
	             b = reader.nextInt(); 
	             a3 = new Node<Integer>(b);
	        }
	        return a1;

	    }
        
	
        
        public static void q4(Node<Integer> a1) {
	        while (a1 != null) {
	            if (a1.getValue()%2==0) {
	            	System.out.println(a1.getValue());
	            }
	            a1 = a1.getNext();  
	        }
	    }
        
        
        
        
        
        public static boolean f5(Node<Integer> a1, int x) {
	        
	        if(a1 != null && a1.getValue()!=x) {
	            return false;
	          
	        }
	        if(a1.getValue()==x) {
	        	return true;
	        }

	        return f5(a1.getNext(),x);
	    }
	
        
        public static Node<Integer> q6(Node<Integer> a1, int x){
        	   Node<Integer> a2 = new Node<Integer>(a1.getValue());
        	   
        	   while (a1.getValue() != null) {
        	      if((a1.getNext()).getValue()==x){
        	         a2.setNext(a1.getNext().getNext());
        	         a1=a1.getNext().getNext();
        	         }
        	      else{
        	       a2.setNext(a1.getNext());
        	       a1=a1.getNext();
        	      }
        	   }
        	    return a1;
        	  } 
        
        
        
        public static Node<Integer> q7(Node<Integer> a1, int x){
     	   Node<Integer> a2 = new Node<Integer>(a1.getValue());
     	   int i=0;
     	   while (a1.getValue() != null) {
     	      if(i==x){
     	         a2.setNext(a1.getNext().getNext());
     	         a1=a1.getNext().getNext();
     	         }
     	      else{
     	       a2.setNext(a1.getNext());
     	       a1=a1.getNext();
     	      }
     	      i++;
     	   }
     	    return a1;
     	  }
        	

        
	
	
    public static void main(String[] args) {
    	
    	  int x = 10;  
          int y = 50;  
          int num = 25;  

          Node<Integer> randomList = f1(x, y);
          System.out.println("Random Linked List: " + randomList);

          int c = f2(randomList, num);
          System.out.println("Occurrences of " + num+ ": " + c);
          
          System.out.println(f5(randomList,26));
          
         // System.out.println(q6(randomList, num));
      }

    }
	}
