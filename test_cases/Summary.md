# Summary of test-cases
1. No functions should be inlined inside the static `main` method.
2. Inlining should be done for instance methods - `Animal->age`.
3. Inlining works properly for multiple methods - `Animal->age` and `Animal->heightInFt`.
4. Do not relay inlining - Inlined version of `Animal->fatherAgeDelta` should contain explicit calls to `Animal->age` and `Animal->fatherAge`.
5. Verify inlining with singular and multiple arguments (with different types too).
6. `System.out.println` is treated verbatim, not modified while inlining.
7. *CHA* allows inlining of methods inherited from parent.
8. `Cat->age` is inlined instead of `Animal->age` when present.
9. *CHA* allows inlining a method from the closest ancestor.
10. Multiple hierarchies work correctly at the same time.
11. *RTA* uses information from initializations to correctly inline dynamically-bounded method (`Cat->age`).
12. Multiple initializations can prevent *RTA* from correct inlining.
13. *RTA* can still work with multiple initializations - can happen if the latest ancestor with the required method is common for all initialized classes (`Mammal->age` is used for inlining here).
14. Another example following the above scenario (`Mammal->age` is inlined).
15. *RTA* fails to inline `m.age()` here because `Mammal` uses `AnimateObject->age` and `Cat` uses `Cat->age`.

### Further testcases
16. Inlining a method twice inside the same method should work (concerned with disambiguating the variable renamings).
17. Basic check for `if-else` and `while-else` also including array initialization and assignments.
18. `this` keyword is handled properly.