def name = 'Groovy'
def template = """
	Hi Himanshu
	 
	${name} is awesome !!!
"""

assert template.toString().contains('Groovy')