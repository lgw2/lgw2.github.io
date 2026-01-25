---
layout: page-with-nav
title: "Projects"
permalink: /research/
nav: true
nav_order: 4
---

# Research Projects

<div class="member-grid">
  
  <div class="member-card clickable-card" onclick="window.open('https://github.com/yourlab/findviralstrains', '_blank')" tabindex="0" role="button" aria-label="View FindViralStrains project">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="FindViralStrains Project - Viral Genomics Research">
    </div>
    <div class="member-content">
      <h3>FindViralStrains</h3>
      <p class="member-role">Ongoing Research</p>
      <div class="member-interests">
        <strong>Keywords:</strong> Viral Genomics, Integer Linear Programming, Bioinformatics
      </div>
      <p class="member-bio">Using Integer Linear Programming (ILP) to examine de Bruijn graphs and analyze viral diversity in metagenomic samples.</p>
      <span class="member-link-hint">View Project Repository →</span>
    </div>
  </div>
  
  <div class="member-card clickable-card" onclick="window.open('https://github.com/yourlab/ptms2pathways', '_blank')" tabindex="0" role="button" aria-label="View PTMS2PATHWAYS project">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="PTMS2PATHWAYS Project - Cell Signaling Research">
    </div>
    <div class="member-content">
      <h3>PTMS2PATHWAYS</h3>
      <p class="member-role">Ongoing Research</p>
      <div class="member-interests">
        <strong>Keywords:</strong> Cell Signaling Pathways, Mass Spectrometry, R Language, Phosphoproteomics
      </div>
      <p class="member-bio">Developing computational tools to map post-translational modifications to cellular signaling pathways using mass spectrometry data.</p>
      <span class="member-link-hint">View Project Repository →</span>
    </div>
  </div>

</div>

## Completed Projects

<div class="member-grid">
  
  <div class="member-card clickable-card alumni" onclick="window.open('https://github.com/yourlab/project-archive-1', '_blank')" tabindex="0" role="button" aria-label="View completed project 1">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="Completed Project 1">
    </div>
    <div class="member-content">
      <h3>Project Archive 1</h3>
      <p class="member-role">Completed Project</p>
      <div class="member-interests">
        <strong>Keywords:</strong> [Keywords]
      </div>
      <p class="member-bio">Description of completed research project and outcomes.</p>
      <span class="member-link-hint">View Archived Repository →</span>
    </div>
  </div>
  
  <div class="member-card clickable-card alumni" onclick="window.open('https://github.com/yourlab/project-archive-2', '_blank')" tabindex="0" role="button" aria-label="View completed project 2">
    <div class="member-image">
      <img src="/images/fakeimage.png" alt="Completed Project 2">
    </div>
    <div class="member-content">
      <h3>Project Archive 2</h3>
      <p class="member-role">Completed Project</p>
      <div class="member-interests">
        <strong>Keywords:</strong> [Keywords]
      </div>
      <p class="member-bio">Description of completed research project and outcomes.</p>
      <span class="member-link-hint">View Archived Repository →</span>
    </div>
  </div>

</div>

<style>
/* Grid layout */
.member-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
  gap: 25px;
  margin: 20px 0;
}

/* Member card styling */
.member-card {
  background: white;
  border-radius: 10px;
  overflow: hidden;
  box-shadow: 0 3px 10px rgba(0,0,0,0.1);
  transition: all 0.3s ease;
  border: 1px solid #eee;
  position: relative;
}

.clickable-card {
  cursor: pointer;
}

.clickable-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 8px 20px rgba(52, 152, 219, 0.2);
  border-color: #3498db;
}

.clickable-card:focus {
  outline: 2px solid #3498db;
  outline-offset: 2px;
}

.member-card.alumni {
  opacity: 0.9;
  background: #f9f9f9;
}

.member-card.alumni:hover {
  border-color: #95a5a6;
  box-shadow: 0 8px 20px rgba(149, 165, 166, 0.2);
}

/* Image styling */
.member-image {
  height: 200px;
  overflow: hidden;
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
}

.member-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-bottom: 3px solid #3498db;
  transition: transform 0.5s ease;
}

.clickable-card:hover .member-image img {
  transform: scale(1.05);
}

.member-card.alumni .member-image img {
  border-bottom-color: #95a5a6;
}

/* Fallback for missing images */
.member-image:not(:has(img)) {
  display: flex;
  align-items: center;
  justify-content: center;
  color: white;
  font-size: 1.2em;
  font-weight: 600;
  text-align: center;
  padding: 20px;
}

/* Content styling */
.member-content {
  padding: 20px;
  position: relative;
}

.member-content h3 {
  margin: 0 0 5px 0;
  color: #2c3e50;
  font-size: 1.3em;
}

.member-role {
  color: #3498db;
  font-weight: 600;
  margin: 0 0 10px 0;
  font-size: 0.95em;
}

.member-card.alumni .member-role {
  color: #7f8c8d;
}

.member-interests {
  background: #f8f9fa;
  padding: 8px 12px;
  border-radius: 5px;
  margin: 10px 0;
  font-size: 0.9em;
  border-left: 3px solid #2ecc71;
}

.member-bio {
  color: #555;
  line-height: 1.5;
  margin: 10px 0 5px 0;
  font-size: 0.95em;
  min-height: 60px;
}

.member-link-hint {
  display: inline-block;
  color: #3498db;
  font-size: 0.9em;
  font-weight: 600;
  margin-top: 12px;
  padding: 4px 8px;
  background: #f8f9fa;
  border-radius: 4px;
  transition: all 0.3s ease;
  border: 1px solid #e9ecef;
}

.clickable-card:hover .member-link-hint {
  background: #3498db;
  color: white;
  transform: translateX(5px);
}

.member-card.alumni .member-link-hint {
  color: #7f8c8d;
  border-color: #dee2e6;
}

.member-card.alumni:hover .member-link-hint {
  background: #7f8c8d;
  color: white;
}

/* Section headers */
h2 {
  color: #2c3e50;
  margin-top: 40px;
  padding-bottom: 10px;
  border-bottom: 2px solid #eee;
}

/* Responsive */
@media (max-width: 768px) {
  .member-grid {
    grid-template-columns: 1fr;
    gap: 20px;
  }
  
  .member-image {
    height: 180px;
  }
  
  .member-link-hint {
    opacity: 1;
    transform: none;
    background: #f8f9fa;
    color: #3498db;
  }
  
  .member-card.alumni .member-link-hint {
    color: #7f8c8d;
  }
}

/* Accessibility improvements */
.clickable-card {
  position: relative;
}

.clickable-card::after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 1;
  pointer-events: none;
  border-radius: 10px;
}

.clickable-card:focus::after {
  box-shadow: 0 0 0 3px rgba(52, 152, 219, 0.3);
}

/* Page title */
h1 {
  color: #2c3e50;
  margin-bottom: 30px;
  padding-bottom: 15px;
  border-bottom: 3px solid #3498db;
}

/* Project-specific styles */
.project-status {
  display: inline-block;
  padding: 2px 8px;
  border-radius: 12px;
  font-size: 0.8em;
  font-weight: 600;
  margin-left: 10px;
  vertical-align: middle;
}

.ongoing {
  background: #d4edda;
  color: #155724;
}

.completed {
  background: #e2e3e5;
  color: #383d41;
}

/* Add subtle animation for project cards */
@keyframes fadeInUp {
  from {
    opacity: 0;
    transform: translateY(20px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.member-card {
  animation: fadeInUp 0.5s ease-out;
}

.member-card:nth-child(2) {
  animation-delay: 0.1s;
}

.member-card:nth-child(3) {
  animation-delay: 0.2s;
}

.member-card:nth-child(4) {
  animation-delay: 0.3s;
}
</style>

<script>
// Make cards keyboard accessible and handle click events
document.addEventListener('DOMContentLoaded', function() {
  const clickableCards = document.querySelectorAll('.clickable-card');
  
  clickableCards.forEach(card => {
    // Set cursor to pointer
    card.style.cursor = 'pointer';
    
    // Add role for screen readers
    card.setAttribute('role', 'button');
    
    // Keyboard support
    card.addEventListener('keydown', function(e) {
      if (e.key === 'Enter' || e.key === ' ') {
        e.preventDefault();
        this.click();
      }
    });
    
    // Optional: Add click sound or visual feedback
    card.addEventListener('mousedown', function() {
      this.style.transform = 'translateY(-2px)';
    });
    
    card.addEventListener('mouseup', function() {
      this.style.transform = 'translateY(-5px)';
    });
    
    // Handle mouse leave
    card.addEventListener('mouseleave', function() {
      this.style.transform = '';
    });
    
    // Add project-specific hover effect
    card.addEventListener('mouseenter', function() {
      if (this.classList.contains('alumni')) {
        this.querySelector('.member-role').style.color = '#5d6d7e';
      }
    });
    
    card.addEventListener('mouseleave', function() {
      if (this.classList.contains('alumni')) {
        this.querySelector('.member-role').style.color = '#7f8c8d';
      }
    });
  });
  
  // Optional: Add a function to handle different types of links
  function openProjectLink(link) {
    // You can customize this function if needed
    window.open(link, '_blank');
  }
});
</script>
