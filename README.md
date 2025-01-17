![Spoooky!](https://github.com/jsannemo/spooky-vm/blob/master/spook.png?raw=true)

Spooky is a simple programming language with an accompanying compiler and virtual machine.

## Requirements

To run the compiler, you need to have Java 14 installed.

## Usage

To compile the source `source.spooky` into the compiled file `exec.spook`, run

```
spooky compile source.spooky exec.spook
```

To execute the program, run

```
spooky spooky.jar run exec.spook
```

## Language features

Spooky is a bare-bones C-like language, supporting only basics such as variables, functions, loops, conditionals and
simple expressions.
While the VM itself is pretty fixed in structure, contributions to the language itself are very welcome.
In particular, features such as

- arrays
- string literals

would be nice.

## External functions

When executing programs, a set of external functions may optionally be provided.
These are declared as `extern` functions in your source and provided by the execution environment.

## Example programs

```c
extern void printInt(int i)
extern void print(int ch)

bool isPrime(int n) {
    int p = 1;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
  }
  return true;
}

void main() {
    for (int n = 90; n < 100; n++) {
        printInt(n);
        print(' ');
        printInt(isPrime(n));
        print('\n');
    }
}
```
