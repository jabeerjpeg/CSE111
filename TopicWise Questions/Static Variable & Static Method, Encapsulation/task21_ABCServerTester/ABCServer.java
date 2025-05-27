package task21_ABCServerTester;

public class ABCServer {
        private String name= "Default";
        private int capacity=10;;
        private String [] nem;
        private String [] role;
        private int count;


        public ABCServer() {
            this.capacity=10;
            nem = new String[capacity];
            role = new String[capacity];
        }

        public ABCServer(String nm ,int cap) {
            this.name= nm;
            this.capacity=cap;
            nem = new String[capacity];
            role = new String[capacity];
        }

        public void details() {
            System.out.println("Server Name: " + this.name);
            System.out.println("Member Capacity: " + this.capacity);
            System.out.println("Total Members: " + this.count);
            System.out.println("Members: " );
            if(count >0){
                for(int i=0;i<count;i++){
                    System.out.println("Name:Role --> " + nem[i]+":"+role[i]);
                }
            }
        }

        public void addMembers(String nm) {
            if(count < capacity) {
                nem[count] = nm;
                role[count] = "Rising Hero";
                count++;

                System.out.println("Rising Hero is added. ");
            }
            else{
                System.out.println("Sorry, maximum capacity exceeded!");
            }
        }

        public void addMembers(String nm, String roles) {
            if(count < capacity) {
                nem[count] = nm;
                role[count] = roles;
                count++;
                System.out.println(roles + " is added. ");
            }
            else{
                System.out.println("Sorry, maximum capacity exceeded!");
            }
        }


}
