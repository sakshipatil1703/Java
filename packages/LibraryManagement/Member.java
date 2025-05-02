package LibraryManagement;

public class Member {
    String name;
    int mem_id;
    int mobile;
    int book_id;

    public Member(int mem_id, String name, int mobile, int book_id) {
        this.mem_id = mem_id;
        this.name = name;
        this.mobile = mobile;
        this.book_id = book_id;
    }

    public void display() {
        System.out.println("\n*** Member Details ***");
        System.out.println("Member ID : " + mem_id);
        System.out.println("Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.println("Book ID : " + book_id);
    }
}
