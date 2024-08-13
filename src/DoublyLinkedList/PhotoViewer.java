package DoublyLinkedList;
import java.util.Scanner;

 public class PhotoViewer{
    private Node head;
    private Node tail;
    private int totalImages;

    public PhotoViewer() {
        this.head = null;
        this.tail = null;
        this.totalImages = 0;
    }
   static class Node {
        String imageName;
        Node next;
        Node prev;
    
        public Node(String imageName) {
            this.imageName = imageName;
            this.next = null;
            this.prev = null;
        }
    }
    public void addImage(String imageName) {
        Node newNode = new Node(imageName);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        totalImages++;
        System.out.println("Image added successfully: " + imageName);
    }

    public void viewNextImage() {
        if (head == null) {
            System.out.println("No images to display.");
        } else {
            System.out.println("Viewing next image: " + head.imageName);
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void viewPreviousImage() {
        if (tail == null) {
            System.out.println("No images to display.");
        } else {
            System.out.println("Viewing previous image: " + tail.imageName);
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
    }

    public void displaySlideshow() {
        Node current = head;
        while (current != null) {
            System.out.println("Viewing image in slideshow: " + current.imageName);
            current = current.next;
        }
    }

    public void deleteImage(String imageName) {
        Node current = head;
        while (current != null) {
            if (current.imageName.equals(imageName)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                }

                totalImages--;
                System.out.println("Image deleted successfully: " + imageName);
                return;
            }
            current = current.next;
        }

        System.out.println("Image not found: " + imageName);
    }

    public void renameImage(String oldName, String newName) {
        Node current = head;
        while (current != null) {
            if (current.imageName.equals(oldName)) {
                current.imageName = newName;
                System.out.println("Image renamed successfully: " + oldName + " to " + newName);
                return;
            }
            current = current.next;
        }

        System.out.println("Image not found: " + oldName);
    }

    public void searchImage(String imageName) {
        Node current = head;
        while (current != null) {
            if (current.imageName.equals(imageName)) {
                System.out.println("Image found: " + imageName);
                return;
            }
            current = current.next;
        }

        System.out.println("Image not found: " + imageName);
    }

    public void displayImageCounter() {
        System.out.println("Total number of images: " + totalImages);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhotoViewer photoViewer = new PhotoViewer();

        while (true) {
            System.out.println("\nPhotoViewer Menu:");
            System.out.println("1. Add new image");
            System.out.println("2. View next image");
            System.out.println("3. View previous image");
            System.out.println("4. Display slideshow");
            System.out.println("5. Delete an image");
            System.out.println("6. Rename/Update an image");
            System.out.println("7. Search for an image");
            System.out.println("8. Display image counter");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter image name: ");
                    String imageName = scanner.next();
                    photoViewer.addImage(imageName);
                    break;
                case 2:
                    photoViewer.viewNextImage();
                    break;
                case 3:
                    photoViewer.viewPreviousImage();
                    break;
                case 4:
                    photoViewer.displaySlideshow();
                    break;
                case 5:
                    System.out.print("Enter image name to delete: ");
                    String deleteName = scanner.next();
                    photoViewer.deleteImage(deleteName);
                    break;
                case 6:
                    System.out.print("Enter old image name: ");
                    String oldName = scanner.next();
                    System.out.print("Enter new image name: ");
                    String newName = scanner.next();
                    photoViewer.renameImage(oldName, newName);
                    break;
                case 7:
                    System.out.print("Enter image name to search: ");
                    String searchName = scanner.next();
                    photoViewer.searchImage(searchName);
                    break;
                case 8:
                    photoViewer.displayImageCounter();
                    break;
                case 9:
                    System.out.println("Exiting PhotoViewer. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

