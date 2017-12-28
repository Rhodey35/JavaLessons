\"\"\" farwell responses \"\"\"

import random

# twenty different farwells
goodbye = ['see you', 'laters', 'have a good one', 'goodnight',
           'going now', 'thanks alot', 'its been real', 'what a night',
           'to da loo', 'leaving', 'leaving now', 'in the morning',
           'thats all', 'to the morrow', 'arrg me mate', 'till the sun comes up']


for comment in list(goodbye):

        #check friend for goodbye response

        if not random.randint(0,19):
            print('We shall see you later.')
            break
        else:
            print('parting, {} and have a good one.'.format(comment))
            goodbye.remove(comment)
