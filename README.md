# Dragon
A simple enhanceable programming language for teaching algorithms.

Dragon is a kind of Lisp with an ALGOL like syntax,
it borrows things from Lisp, Algol, Smalltalk, Ruby and Groovy.

The traditional function of fibonacci written in dragon
```
def(fib: \n -> 
  "returns the fibonacci number of n"
  if(n < 2
     1
     fib(n - 1) + fib(n - 2))
)

print(fib(7))
```

Dragon uses the Java Virtual Machine (and java.base) as its runtime environment.

Dragon is still in development, currently it exists only a simple AST interpreter that defines the semantics,
the plan is to create a runtime compiler (a JIT at the dragon level if you prefer) written in dragon itself.


# Dragon - jigsaw compatible

There is an experimental branch that shows how to jigsawify the dragon workspace
  [jigsaw branch](https://github.com/forax/dragon/tree/jigsaw)


