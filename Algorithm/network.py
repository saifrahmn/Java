import configparser
import sys
import os

def get_chatterbot_version():
    config = configparser.ConfigParser()

    current_directory = os.path.dirname