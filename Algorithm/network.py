import random
import numpy as np
class network(object):
    def __init__(self, sizes):
        self.num_layer=len(sizes)
        self.sizes=sizes
        self.biases=[np.random.randn(y,1) for y in sizes[1:]]
        self.weights=[np.random.randn(y,x)
                        for x,y in zip(sizes[:-1],sizes[1:])]
                        
        def feedforward(self,a):
            for b,w in zip(self.biases, self.weights):
                a= sigmoid(np.dot(w, a)+b)
            return a
            
        def SGD(self, training_data, epochs, mini_batch_sizes,eta,test_data=None):
            if test_data: n_test = len(test_data)
            n = len(training_data)
            for j in xrange(epochs)
#these is a comment to check whether the Zed auto puts the code in the repositary