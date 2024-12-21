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

public class Main {
	public static Scanner reader = new Scanner (System.in);
	public static Node<Integer> generateRandomNumbers(int x, int y, int n) {
		Node<Integer> head = new Node<>((int) (Math.random() * (y - x + 1)) + x);
		Node<Integer> current = head;

		for (int i = 1; i < n; i++) {
			Node<Integer> newNode = new Node<>((int) (Math.random() * (y - x + 1)) + x);
			current.setNext(newNode);
			current = current.getNext();
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

	public static Node<Integer> buildListFromArr(int[] arr) {
		Node<Integer> head = new Node<>(arr[0]);
		Node<Integer> current = head;
		for(int i=1; i<arr.length; i++) {
			Node<Integer> newNode = new Node<>(arr[i]);
			current.setNext(newNode);
			current = newNode;
		}
		return head;
	}

	public static void printList(Node<Integer> head) {
		Node<Integer> current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}

	public static void printListRecursive(Node<Integer> head) {

		if (head == null) {
			return;
		}
		System.out.println(head.getValue());
		printListRecursive(head.getNext());
	}

	public static void printOppositeListRecursive(Node<Integer> head) {

		if (head == null) {
			return;
		}
		printOppositeListRecursive(head.getNext());
		System.out.println(head.getValue());

	}	

	public static Node<Integer> buildList() {
		Node<Integer> head = new Node<Integer>(null);
		Node<Integer> current = head;

		System.out.println("Enter numbers possitive or -1");
		int num = reader.nextInt();
		while(num != -1) {
			Node<Integer> newNode = new Node<Integer>(num);
			current.setNext(newNode);
			current = newNode;
			System.out.println("Enter number or -1 to end:");
			num = reader.nextInt();
		}
		return head.getNext();
	}

	public static void printListEven(Node<Integer> head) {
		while(head != null) {
			if ((head.getValue())%2==0) {
				System.out.println(head.getValue());
			}
			head = head.getNext();
		}
	}


	public static Node<Integer> deleteNodeByValue(Node<Integer> head, int x){
		head = new Node<>(null, head);
		Node<Integer> current = head;

		while (current != null) {
			if(current.getNext().getValue().equals(x)){
				current.setNext(current.getNext().getNext());
				return head.getNext();
			}
			current = current.getNext();
		}
		return head.getNext();
	} 

	public static Node<Integer> deleteNodeByIndex(Node<Integer> head, int x){
		head = new Node<>(null, head);
		Node<Integer> current = head;
		int nodeCount=1;

		while (current != null) {
			if(nodeCount==x){
				current.setNext(current.getNext().getNext());
				return head.getNext();
			}
			nodeCount++;
			current = current.getNext();
		}
		return head.getNext();
	} 

	private static boolean ifL1InL2TailRecursive(Node<Integer> head1, Node<Integer> head2,Node<Integer> current) {
		if (head1 == null) {
			return true;  
		}
		if (current == null) {
			return false;  
		}

		if (head1.getValue() == current.getValue()) {
			return ifL1InL2TailRecursive(head1.getNext(),head2,head2);
		} 
		else {
			return ifL1InL2TailRecursive(head1, head2,current.getNext());
		}
	}

	private static void printL1InL2(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> current = head2;

		while (head1 != null) {
			while (current != null) {
				if(head1.getValue() == current.getValue()){
					System.out.println(current.getValue());
					current=null;
				}
				else {
					current=current.getNext();
				}
			}
			current = head2;
			head1=head1.getNext();
		}
	}
	
	private static Node<Integer> listFromL1L2(Node<Integer> head1, Node<Integer> head2) {
		
		Node<Integer> head3 = new Node<Integer>(null,null);
		Node<Integer> newCurrent = head3;
		Node<Integer> current = head2;

		while (head1 != null) {
			while (current != null) {
				if(head1.getValue() == current.getValue()){
					newCurrent.setValue(current.getValue());
					if (head1.getNext() == null) {
						return head3;
					}
					Node<Integer> newNode = new Node<Integer>(null,null);
					newCurrent.setNext(newNode);
					newCurrent=newNode;
					current=null;
				}
				else {
					current=current.getNext();
				}
			}
			current = head2;
			head1=head1.getNext();
		}
		
		return head3;
	}
	
	private static Node<Integer> delL1InL2(Node<Integer> head1, Node<Integer> head2) {

	    Node<Integer> head0 = new Node<>(null, head1); 
	    Node<Integer> current1 = head0; 
	    Node<Integer> current2;

	    while (current1.getNext() != null) {
	        boolean shouldDelete = false;
	        current2 = head2;

	        while (current2 != null) {
	            if (current1.getNext().getValue() == current2.getValue()) {
	                shouldDelete = true;
	                break;
	            }
	            current2 = current2.getNext();
	        }

	        if (shouldDelete) {
	            current1.setNext(current1.getNext().getNext());
	        } else {
	            current1 = current1.getNext();
	        }
	    }
	    return head0.getNext();
	}

	
	
	
	
	
	
	public static void main(String[] args) {

		int [] a = {5,6,5,122,456,8,8,11,15,12};
		int [] b = {5,6,7,8,11,11,15,15};
		Node<Integer> head1 = buildListFromArr(a);
		Node<Integer> head2 = buildListFromArr(b);
		head1 = listFromL1L2(head1,head2);
		System.out.println(delL1InL2(head1,head2));

	}
}
