def adder = {a, b->  a + b }

assert adder(1, 2) == 3
assert adder('a', 'b') == 'ab' // Dynamic Language

// Short form of adder 

assert adder.call('a', 'b') == 'ab'