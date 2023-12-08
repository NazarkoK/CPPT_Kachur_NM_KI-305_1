class Monitor:
    def __init__(self, brand, size, width_resolution, height_resolution):
        super().__init__()
        self.brand = brand
        self.size = size
        self.width_resolution = width_resolution
        self.height_resolution = height_resolution
        self.brightness_control = BrightnessControl()

    def display_info(self):
        print(f"Monitor: {self.brand}, Size: {self.size} inches, Resolution: {self.width_resolution}x{self.height_resolution}")
        self.brightness_control.display_brightness()

    def power_on(self):
        print("Monitor is powered on.")

    def power_off(self):
        print("Monitor is powered off.")

    def input_monitor_data(self):
        self.brand = input("Enter the brand of the monitor: ")
        self.size = int(input("Enter the size of the monitor (in inches): "))
        self.width_resolution = int(input("Enter the width resolution of the monitor: "))
        self.height_resolution = int(input("Enter the height resolution of the monitor: "))
        self.brightness_control.change_brightness()

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
