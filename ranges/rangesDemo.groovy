def range = 'a'...'z'

assert range.contains('m')
assert range.contains('z')


def exclusive = 1..<10 // Excluded upper bound
assert !exclusive.contains('10') 

def reverse = 10..0
assert reverse[0] == 10
assert reverse[-1] == 0