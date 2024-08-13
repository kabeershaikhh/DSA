package DSA_Practical;

public class ContactList {
    String[][] contacts = new String[10][2];

    ContactList(String arr[][]) {
        this.contacts = arr;
    }

    void printContacts() {
        System.out.println("Name   Contact No: ");
        for (int i = 0; i < contacts.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(contacts[i][j]+ " ");
            }
            System.out.println();
        }
    }
    void search(String name){
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0].equalsIgnoreCase(name)) {
                System.out.println("The contact is found: ");
                System.out.println("Name: "+contacts[i][0]+" No: "+contacts[i][1]);
                break;
            }
           
        }
          
    }
    

    public static void main(String[] args) {
        String[][] kabeerC = { { "Kabeer", "033337969" }, { "Yaqoob", "033365827" }, { "Yashfaien", "033365827" },
                { "Mubashir", "033365827" }, { "Azhar", "033365827" }, { "Zain", "033365827" },
                { "Irfan", "033365827" }, { "Zaeem", "033365827" },{"Ahmed","033365827"}};
        ContactList kabeer = new ContactList(kabeerC);
      //kabeer.printContacts();
        kabeer.search("azhar");
        kabeer.search("yaqOOb");
     //   String[][] arr={{"kjashd","2342342"}};
        }
}
