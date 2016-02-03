def sum = { ...elements -> elements.sum() }

assert sum(1, 2) == 3
assert sum('a', 'b', 'c') == 'abc'