class BrightnessControl:
    def __init__(self):
        self.brightness = 50

    def adjust_brightness(self, value):
        self.brightness = max(0, min(value, 100))

    def display_brightness(self):
        print(f"Brightness: {self.brightness}%")

    def change_brightness(self):
        try:
            new_brightness = int(input("Enter the new brightness level (0-100): "))
            if 0 <= new_brightness <= 100:
                self.adjust_brightness(new_brightness)
                print("Brightness changed successfully.")
            else:
                print("Invalid brightness level. Please enter a value between 0 and 100.")
        except ValueError:
            print("Invalid input. Please enter a valid integer value.")

