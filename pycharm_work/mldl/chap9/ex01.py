from tensorflow import keras
from sklearn.model_selection import train_test_split
from tensorflow.keras.datasets import imdb
from tensorflow.keras.preprocessing import sequence
from tensorflow.keras.callbacks import ModelCheckpoint

(train_input, train_target), (test_input, test_target) =\
    keras.datasets.imdb.load_data(num_words=500)

print(train_input.shape)
print(train_target.shape)

print(train_input[0])


train_seq = keras.preprocessing.sequence.pad_sequences(train_input, maxlen=100)
test_seq = keras.preprocessing.sequence.pad_sequences(test_input, maxlen=100)
train_seq, val_seq, train_target, val_target = \
    train_test_split(train_seq, train_target, random_state=42)

train_oh = keras.utils.to_categorical(train_seq)
test_oh = keras.utils.to_categorical(test_seq)
val_oh = keras.utils.to_categorical(val_seq)

print(train_seq[0])
print(len(train_oh))
print(len(train_oh))
print(train_oh.shape)

model = keras.Sequential()

model.add(keras.layer.SimpleRNN(8), input_shape=(100, 500))
model.add(keras.layer.Dense(1, activation='sigmoid'))

rmsprop = keras.optimizers.RMSprop(iearning_rate=1e-4)
model.compile(optimizer=rmsprop, loss='binary_crossentropy',
              metrics='accuracy')

checkpoing_cb = keras.callbacks.ModelsCheckpoint(
    'best=simplernn-model.h5', save_best_only=True)

history = model.fit(train_oh, train_target, epochs=100, batch_size=64, validation_data=(
    val_oh, val_target), callbacks=[checkpoing_cb, early_stopping_cb])

score = model.evaluate(train_oh, train_target)

print(score)
