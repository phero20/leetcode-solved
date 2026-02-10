/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
   let a = 0, b = 1;
   while (true) {
       yield a;           // produce the current Fibonacci number
       [a, b] = [b, a + b]; // update to the next pair
   }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 * gen.next().value; // 1
 * gen.next().value; // 2
 * gen.next().value; // 3
 */
