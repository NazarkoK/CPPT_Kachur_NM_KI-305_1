class TouchScreen:
    def __init__(self, multi_touch_support=True):
        self.multi_touch_support = multi_touch_support

    def touch(self):
        if self.multi_touch_support:
            print("Multi-touch is supported. Performing multi-touch operation.")
        else:
            print("Performing single-touch operation.")

    def interact(self):
        user_input = input("Enter text to interact with the touch screen: ")
        print(f"Interacting with touch screen: {user_input}")
