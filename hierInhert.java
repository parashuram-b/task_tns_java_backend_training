package task_tasks;
	class Animal{
		public void eat(){
			System.out.println("all animals eat");
		}
		
	}
	
	class Dog extends Animal{
		public void bark() {
			System.out.println("dark barks");
		}
	}
	class Cat extends Animal{
		public void meow() {
			System.out.println("Cat meow");
		}
	}
	public class hierInhert {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Cat c = new Cat();
		c.eat();
		c.meow();

	}

}
