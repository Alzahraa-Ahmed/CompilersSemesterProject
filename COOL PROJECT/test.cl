(program(programBlocks(classDefine class B {
        (feature s: String) < -"Hello");
    (programBlocks g(y: String): Int {
            y.concat(s)
        }; f(x: Int): Int {
            x + 1
        };
    }; class A inherits B {
        a: Int;b: B < -new B;f(x: Int): Int {
            x + a
        };
    }; class Main {
        main(): Object {
            (new IO).out_string("HelloWorld")
        };
    };)))