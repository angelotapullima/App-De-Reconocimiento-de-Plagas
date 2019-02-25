from keras.models import load_model
#from keras.models import Sequential
#from keras.layers import Conv2D, MaxPooling2D
#from keras.layers import Activation, Dropout, Flatten, Dense

from keras.preprocessing.image import img_to_array, load_img
import numpy as np
#import cv2
import sys

nombre=sys.argv[1]

import warnings
warnings.filterwarnings("ignore")

from datetime import datetime

inicio=datetime.now()
# dimensiones de las imagenes
#dir_image = 'data/test/hojas.jpg'
dir_image = nombre
#dir_image = 'data/1.jpg'
#test_model = load_model('model/model_hojas.h5')
test_model = load_model('model_hojas_v2.0_150.h5')
img = load_img(dir_image,False,target_size=(224,224))
x = img_to_array(img)
x = np.expand_dims(x, axis=0)

preds = test_model.predict_classes(x)
probs = test_model.predict_proba(x)

#print (preds)
#print (probs)

#print(test_model.summary())


label = 'No identificado';
if preds == 0:
    label = 'Hoja sin plaga'
if preds == 1:                             
	label = 'tuthillia cognata'

print (label)


#orig = cv2.imread(dir_image)
#cv2.putText(orig, "Objeto: {}".format(label),
#	(10, 30), cv2.FONT_HERSHEY_SIMPLEX, 0.8, (0, 0, 255), 2)

fin=datetime.now()
tiempo=fin-inicio
tiempo_segundo=tiempo.seconds
#print("Tiempo proceso",tiempo_segundo," s")

##cv2.namedWindow(orig,cv2.WINDOW_NORMAL)
##cv2.resizeWindow(orig, 600,600)
#cv2.imshow("Clasificacion", orig)
#cv2.imwrite('messigray.png',orig)
#cv2.waitKey(0)