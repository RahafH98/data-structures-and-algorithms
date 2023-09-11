package stack.queue.animal.shelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Animal("cat", "Whiskers"));
        shelter.enqueue(new Animal("dog", "Buddy"));
        shelter.enqueue(new Animal("dog", "Rex"));
        shelter.enqueue(new Animal("cat", "Fluffy"));

        System.out.println(shelter.dequeue("dog").name); // Output: Buddy (preferring dog)
        System.out.println(shelter.dequeue("cat").name); // Output: Whiskers (preferring cat)
        System.out.println(shelter.dequeue("parrot"));    // Output: null (invalid preference)
        System.out.println(shelter.dequeue("any").name);  // Output: Rex (stretch goal: longest waiting)
    }
}
